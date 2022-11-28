import com.todo.todospring.domain.Member;
import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void connectionTest() throws SQLException {

        Connection conn = dataSource.getConnection();

        log.info(conn);

        Assertions.assertNotNull(conn);

        conn.close();
    }



    @Autowired(required = false)
    private MemberMapper memberMapper;

    @Test
    public void insertMemberTest() throws SQLException {

        Member member = Member.builder()
                              .uid("hot")
                              .pw("1234")
                              .uname("HOT")
                              .build();

        int result = memberMapper.insertMember(member);

        Assertions.assertEquals(1, result);

    }

    @Test
    public void selectByIdPwTest() throws SQLException {

        Member member = memberMapper.selectByIdPw("cool", "1111");

        log.info(member);

        Assertions.assertNotNull(member);

    }



    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void selectAllTest() {

        List<TodoDTO> list = todoMapper.selectAll();

        log.info(list);

    }

    @Test
    public void selectByTnoTest() {

        TodoDTO todoDTO = todoMapper.selectByTno(1);

        log.info(todoDTO);

        Assertions.assertNotNull(todoDTO);

    }

    @Test
    public void insertToDoTest() {

        TodoDTO todoDTO = TodoDTO.builder()
                                 .todo("단위 테스트")
                                 .dueDate(LocalDate.now())
                                 .build();

        int result = todoMapper.insertToDo(todoDTO);

        Assertions.assertEquals(1, result);

    }

    @Test
    public void updateTodoTest() {

        TodoDTO todoDTO = TodoDTO.builder()
                                 .tno(1)
                                 .todo("단위테스트 결과 보고")
                                 .finished(true)
                                 .build();

        int result = todoMapper.updateTodo(todoDTO);

        Assertions.assertNotNull(todoDTO);

    }

    @Test
    public void deleteTodoTest() {

        int result = todoMapper.deleteTodo(2);
        Assertions.assertEquals(1, result);

    }

}