import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent { 
  todoArray=[]
  index
  
  addTodo(value){
    this.index = this.todoArray.length
    this.todoArray.push(value)
    console.log(value) }

  delete(number){
    this.todoArray.splice(number,1)
  }

  deleteAll(){
    for (let i = 0; i <= this.todoArray.length; i++) {
      i = 0
      this.todoArray.splice(i,1)
    }
  }

}


