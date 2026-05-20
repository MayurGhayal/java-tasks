localStorage.setItem("username","Mayur")
localStorage.setItem("pass",2004)
localStorage.setItem("user","unique")
localStorage.setItem("username2","ravan")

let user =localStorage.getItem("username")
console.log(user);


let form =document.getElementById("form")
let input =document.getElementById("input")

form.addEventListener("submit",(event)=>{
    event.preventDefault()
    console.log(input.value);
    
    localStorage.setItem("username",input.value)
    input.value=""
})








