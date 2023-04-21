/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here
package com.example.todo.controller; 
import java.util.*; 
import com.example.todo.service.*; 
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired; 
import com.example.todo.model.*;

@RestController 
public class TodoController extends TodoH2Service{
 
   @Autowired
   public TodoH2Service todoService;  

   @GetMapping("/todos") 
   public ArrayList<Todo> getTodos(){
    return todoService.getTodos();
   } 

   @GetMapping("/todos/{id}")
   public Todo getTodoById(@PathVariable("id") int id){
    return todoService.getTodoById(id);
   } 

   @PostMapping("/todos")
   public Todo addTodo(@RequestBody Todo todo){
    return todoService.addTodo(todo);
   } 

   @PutMapping("/todos/{id}")
   public Todo updateTodo(@PathVariable("id") int id, @RequestBody Todo todo){
      return todoService.updateTodo(id, todo);
   } 

   @DeleteMapping("todos/{id}")
    public void deleteTodo(@PathVariable("id") int id){
       todoService.deleteTodo(id);
    }
}
















