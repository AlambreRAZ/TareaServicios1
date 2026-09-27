package mx.edu.utez.TareaServicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Alito")
public class TareaController {

    private final String Nombre = "ALBARRAN CANDIA ALONDRA RAZIEL";

    @GetMapping("/fizzbuzz/{A}")
    public String fizzBuzz(@PathVariable int A) {
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
        return Nombre;

    }

    @GetMapping("/fibonacci/{R}")
    public String fibonacci(@PathVariable int R){
        if (R <= 0){
            return Nombre;
        }

        long a = 0;
        long b = 1;

        if (R == 1){
            System.out.println(a);
        }else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 3; i <= R; i++) {
                long siguiente = a + b;
                System.out.println(siguiente);
                a =b;
                b = siguiente;

            }
        }
        return Nombre;
    }

}
