

        document.addEventListener('DOMContentLoaded', () => {

            // 문서객체 생성
            const loginForm = document.querySelector('#regForm');
            const userID = document.querySelector('#userID');
            const pw = document.querySelector('#pw');
            const repw = document.querySelector('#repw');
            const userName = document.querySelector('#userName');

            loginForm.addEventListener('submit', (event) => {

                const userID = document.querySelector('#userID');
                const pw = document.querySelector('#pw');
                const repw = document.querySelector('#repw');
                const userName = document.querySelector('#userName');


                // String search => 0 / -1
                console.log(userID.value.search(/[a-zA-Z0-9]/))
                console.log(/[a-zA-Z0-9]/.test(userID.value))

                if(!/[a-zA-Z0-9]/.test(userID.value)) {

                    alert('아이디는 대문자 소문자 숫자만을 조합하는 문자열 입력만 가능합니다.')
                }

                event.preventDefault();
                
            })

            userID.addEventListener('focusin', (event) => {

                console.log('focus in')

            })

            userID.addEventListener('focusout', (event) => {

                console.log('focus out')
                const val = event.target.value

                if(!/[a-zA-Z0-9]/.test(val)) {
                    alert('영문 소문자 영문 대문자 숫자만 입력가능')
                }
            })

        })

        document.addEventListener('DOMContentLoaded', () => {
    
            // 문서객체 생성
            const input = document.querySelector('#userID');
            const output = document.querySelector('#pw');

            const addBtn = document.querySelector('#addBtn');
            const todolist = document.querySelector('#list');


            let cnt = 0;


            // 핸들러 함수
            const addTodo = () => {
               
                if(input.value.trim() === '') {
                    alert('아이디를 입력해주세요')
                    return
                }
                

                // 동적으로 추가할 엘리먼트 생성
                const newDiv = document.createElement('div')
                const todo = document.createElement('span')
                const cpw = document.createElement('span')
                const btn = document.createElement('button')

                newDiv.appendChild(todo)
                newDiv.appendChild(cpw)
                newDiv.appendChild(btn)


                // 속성 설정
                newDiv.style.padding = '10px'

                cpw.style.padding = '10px'
                
                const key = cnt++;

                newDiv.setAttribute('data-key', key)

                todo.textContent = input.value
                cpw.textContent = output.value
                btn.textContent = '회원정보 삭제'


                // 이벤트 적용

                btn.addEventListener('click', (event) => {
                    removeTodo(key)
                })


                // todoList에 새로운 div 추가
                todolist.appendChild(newDiv)

                input.value = ''
                output.value = ''
            }
            
            const removeTodo = function(key) {
                const delElement = document.querySelector(`div[data-key="${key}"]`)
                todolist.removeChild(delElement)
            }


            // 이벤트 연결
            addBtn.addEventListener('click', addTodo)

        })
