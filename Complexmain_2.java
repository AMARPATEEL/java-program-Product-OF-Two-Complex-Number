class Complex
{
    int Real,Imag;
    Complex()
    {}
    Complex(int Real1,int Imag1)
    {
        Real=Real1;
        Imag=Imag1;
    }
    Complex ProComplex(Complex C1,Complex C2)
    {
        Complex CPro=new Complex();
        CPro.Real=C1.Real*C2.Real;
        CPro.Imag=C1.Imag*C2.Imag;
        return CPro;
    }
}
 
class Complexmain_2
{
    public static void main(String[] a)
    {
        Complex C1=new Complex(4,8);
        Complex C2=new Complex(5,7);
        Complex C3=new Complex();
        C3=C3.ProComplex(C1,C2);
        System.out.println("Real="+C1.Real+ "-" +C2.Real);
        System.out.println("Imag="+C1.Imag+ "-" +C2.Imag);
        System.out.println("Diff:" + C3.Real +"-" + C3.Imag+ "i");
    }
}