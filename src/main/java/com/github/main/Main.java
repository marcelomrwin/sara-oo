package com.github.main;

import com.github.a.Cantor;
import com.github.a.CantorBrega;
import com.github.a.CantorLirico;
import com.github.b.Departamento;
import com.github.x.Motorista;
import com.github.y.Vendedor;

/**
 *
 * @author marcelosales
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("INICIO");
        //
        
        Cantor objetoCantor = new CantorBrega();  // new CantorLirico();
        Motorista objetoMotorista = new Motorista();
        Vendedor objetoVendedor = new Vendedor();
        objetoVendedor.setSalario(100.0);
        
        
        objetoCantor.cantar(15);
        
        
        Departamento objetoDepartamento = new Departamento();
        objetoDepartamento.setMetaDepartamento(100.0);
        
        objetoVendedor.estabelecerMeta(objetoDepartamento.getMetaDepartamento(), 1);
        System.out.println(objetoVendedor.getMeta());
        
        
        //
        System.out.println("FIM");
    }
    
}