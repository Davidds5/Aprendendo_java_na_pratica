package orientacaoAObjetos;

public class Rectangle {
    public double altura;
    public double largura;


    public double area(){
        return  altura * largura;
    }
    public double perimnetro(){
        return 2 * (altura * largura);
    }
    public double diagonal(){
        return Math.sqrt(altura * largura + altura * largura);

    }

}
