package ues.edu.sv.tarea_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.math.*; //importamos la libreria para la raiz cuadrada y el exponencial
import java.text.DecimalFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //declaracion de todas las variables que vamos usar en el programa entre estos los botones, numeros, resultado, etc.
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton0;
    Button botonMasMenos;
    Button botonPunto;
    Button botonSuma;
    Button botonResta;
    Button botonDivision;
    Button botonMultiplicacion;
    Button botonRaiz;
    Button botonAlCuadrado;
    Button botonIgual;
    Button botonLimpiar;
    TextView txtResultado;
    boolean encenderApagar = false;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float resultado1 = 0.0f;
    String operacion = "";
    String[] decimales = {"0.","0.0","0.00","0.000","0.0000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declarando los botones y la pantalla de resultados
         boton1 =  findViewById(R.id.btnuno);
         boton2 =  findViewById(R.id.btndos);
         boton3 =  findViewById(R.id.btntres);
         boton4 =  findViewById(R.id.btncuatro);
         boton5 =  findViewById(R.id.btncinco);
         boton6 =  findViewById(R.id.btnseis);
         boton7 =  findViewById(R.id.btnsiete);
         boton8 = findViewById(R.id.btnocho);
         boton9 =  findViewById(R.id.btnnueve);
         boton0 =  findViewById(R.id.btncero);
         botonMasMenos = findViewById(R.id.btnmasmenos);
         botonPunto =  findViewById(R.id.btnpunto);
         botonSuma =  findViewById(R.id.btnsuma);
         botonResta =  findViewById(R.id.btnresta);
         botonDivision =  findViewById(R.id.btndivision);
         botonMultiplicacion =  findViewById(R.id.btnmultiplicacion);
         botonRaiz =  findViewById(R.id.btnraiz);
         botonAlCuadrado = findViewById(R.id.btncuadrado);
         botonIgual =  findViewById(R.id.btnigual);
         botonLimpiar =  findViewById(R.id.btnlimpiar);
         txtResultado =  findViewById(R.id.txtpantalla);
         //la calculadora estara apagada desde el inicio
         deshabilitar();
    }



    //metodo para encender o apagar la calculadora lo que hace es deshabilitar o habilitar los botones dependiendo del caso
    public void apagarEncender(View view) {

         if(!encenderApagar){
             deshabilitar();
         }else{
             habilitar();

         }

    }

    //metodo para hablilitar los botones esto ocurre cuando la calculadora se enciende
    private void habilitar() {
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton7.setEnabled(true);
        boton8.setEnabled(true);
        boton9.setEnabled(true);
        boton0.setEnabled(true);
        botonMasMenos.setEnabled(true);
        botonPunto.setEnabled(true);
        botonSuma.setEnabled(true);
        botonResta.setEnabled(true);
        botonDivision.setEnabled(true);
        botonMultiplicacion.setEnabled(true);
        botonRaiz.setEnabled(true);
        botonAlCuadrado.setEnabled(true);
        botonIgual.setEnabled(true);
        botonLimpiar.setEnabled(true);
        txtResultado.setText("0");
        encenderApagar=false;
    }
    //metodo para deshabilitar los botones esto ocurre cuando la calculadora estara apagada
    private void deshabilitar() {
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
        boton5.setEnabled(false);
        boton6.setEnabled(false);
        boton7.setEnabled(false);
        boton8.setEnabled(false);
        boton9.setEnabled(false);
        boton0.setEnabled(false);
        botonMasMenos.setEnabled(false);
        botonPunto.setEnabled(false);
        botonSuma.setEnabled(false);
        botonResta.setEnabled(false);
        botonDivision.setEnabled(false);
        botonMultiplicacion.setEnabled(false);
        botonRaiz.setEnabled(false);
        botonAlCuadrado.setEnabled(false);
        botonIgual.setEnabled(false);
        botonLimpiar.setEnabled(false);
        txtResultado.setText("");
        encenderApagar=true;
    }

    //metodos para escribir el numero de cada boton que se presione en la calculadora y mostrarlo en pantalla
    public void escribirUno(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            /*como lo que quiero es poder escribir 0.1,0.2, etc cree un array con todos los posibles casos
            * luego convierto el string de array en una lista para poder usar el metodo de contains
            * para saber si el texto de la pantalla de la calculadora cumple con algunos de los caos del
            * array y poder concatenar el texto
            * */
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "1");
            }
            else {
                txtResultado.setText("1");
            }
        } else{
            txtResultado.setText(txtResultado.getText() + "1");
        }
    }

    public void escribirDos(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "2");
            }
            else {
                txtResultado.setText("2");
            }
        } else{
            txtResultado.setText(txtResultado.getText() + "2");
        }
    }

    public void escribirTres(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "3");
            }
            else {
                txtResultado.setText("3");
            }
        } else{
            txtResultado.setText(txtResultado.getText() + "3");
        }
    }

    public void escribirCuatro(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "4");
            }
            else {
                txtResultado.setText("4");
            }
        } else{
            txtResultado.setText(txtResultado.getText() + "4");
        }
    }

    public void escribirCinco(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "5");
            }
            else {
                txtResultado.setText("5");
            }
        }else{
            txtResultado.setText(txtResultado.getText() + "5");
        }
    }

    public void escribirSeis(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "6");
            }
            else {
                txtResultado.setText("6");
            }
        }else{
            txtResultado.setText(txtResultado.getText() + "6");
        }
    }

    public void escribirSiete(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "7");
            }
            else {
                txtResultado.setText("7");
            }
        } else{
            txtResultado.setText(txtResultado.getText() + "7");
        }
    }

    public void escribirOcho(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "8");
            }
            else {
                txtResultado.setText("8");
            }
        }else{

            txtResultado.setText(txtResultado.getText() + "8");
        }
    }

    public void escribirNueve(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0.0f || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "9");
            }
            else {
                txtResultado.setText("9");
            }
        } else {
            txtResultado.setText(txtResultado.getText() + "9");
        }
    }

    public void escribirCero(View view) {
        float valor = Float.parseFloat(txtResultado.getText().toString());
        if(valor == 0 || valor == numero1 || valor == limitarDecimales(resultado1)){
            if(Arrays.asList(decimales).contains(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText() + "0");
            }
            else {
                txtResultado.setText("0");
            }
        } else {
            txtResultado.setText(txtResultado.getText() + "0");
        }
    }

    //tecla para borrar de la memoria y de la pantalla calculos que se hayan realizado
    public void borrarPantalla(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        resultado1 = 0.0f;
        operacion = "";
        txtResultado.setText("0");
    }

    //boton para cambiar el signo al valor que se encuentre ingresado en pantalla
    public void cambiarMasMenos(View view) {
        float valor = Float.parseFloat(String.valueOf(txtResultado.getText()));
        valor = valor * -1.0f;
        txtResultado.setText("" + valor);
    }

    //boton para escribir el punto decimal primero se verifica si ya hay un punto de ser asi no lo escribe
    public void escribirPunto(View view) {
        if( !String.valueOf(txtResultado.getText()).contains(".") ){
            txtResultado.setText(txtResultado.getText() + ".");
        }
    }

    //metodos para saber cual opercion se va realizar
    public void operacionDividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        operacion = "/";

    }

    public void operacionMultiplicar(View view) {
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        operacion = "*";

    }

    public void operacionResta(View view) {
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        operacion = "-";

    }

    public void operacionSuma(View view) {
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        operacion = "+";

    }

    public void elevarCuadrado(View view) {
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        operacion = "^";

    }

    //programacion del boton igual para realizar las operaciones
    public void realizarOPeraciones(View view) {
        numero2 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        float result,resultado = 0.0f;
        resultado1=0.0f;


        if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
                resultado = limitarDecimales(result);
            }else{
                resultado = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA: NO se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            resultado = numero1 * numero2;

        }else if(operacion.equals("-")){
            resultado = numero1 - numero2;
        }else if(operacion.equals("+")){
            resultado = numero1 + numero2;
        }else if(operacion.equals("^")){
            if(numero2 == 0.0f){
                resultado = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();

            }else {
                result = (float) Math.pow(numero1, numero2);
                resultado = limitarDecimales(result);
            }
        }else if(operacion.equals("")){
            resultado = Float.parseFloat(String.valueOf(txtResultado.getText()));
        }

        //si el resultado es 0.0 quiero mostrar 0 y no 0.0 para evitar bug
        if(resultado == 0.0f){
            txtResultado.setText("0");
        } else {
            txtResultado.setText(resultado + "");
        }
        //limpiado los datos
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        resultado1=resultado;
    }

    //operacion para sacar la raiz cuadrada de un numero
    public void operacionRaiz(View view) {
        resultado1=0.0f;
        double result;
        float resultado;
        numero1 = Float.parseFloat(String.valueOf(txtResultado.getText()));
        if(numero1 > 0) {
            result = Math.sqrt(numero1);
            resultado = limitarDecimales((float)result);
        }else{
            resultado = 0.0f;
            Toast.makeText(this, "OPERACION NO VALIDA: No se puede sacar raiz a numeros negativos", Toast.LENGTH_LONG).show();
        }

        if(resultado == 0.0f){
            txtResultado.setText("0");
        } else {
            txtResultado.setText(resultado + "");
        }
        numero1 = 0.0f;
        resultado1=resultado;

    }

    //funcion para limitar el numero de decimales para manejar de mejor manera las respuestas en pantalla
    private Float limitarDecimales(float n){
        DecimalFormat df = new DecimalFormat("#.00000");

        return Float.valueOf(df.format(n));
    }
}