/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Leonardo
 */


@RunWith(value = Parameterized.class)
public class CalculadoraIpTest {
    private int primerOctIpDec;
    private int segundoOctIpDec;
    private int tercerOctIpDec;
    private int cuartoOctIpDec;
    private String clase;
    private int bitsAEncender;
    private String mascBin;
    private String mascBinEsperada;
    private String IpBin;
    private int prefijo;
    private String RedBin;
    private String primerOctRedDec;
    private String segundoOctRedDec;
    private String tercerOctRedDec;
    private String cuartoOctRedDec;
    private String BroadCBin;
    private String primerOctBroadCDec;
    private String segundoOctBroadCDec;
    private String tercerOctBroadCDec;
    private String cuartoOctBroadCDec;
    
    @Parameters
    public static Iterable<Object[]> bateriaDePruebas(){

         List<Object[]> bateriaP = Arrays.asList(new Object[][]{
//           PO  SO   TO  CO   CL   BAE               MASC                               SUBMASC                     ip bin                         P     redBinario                        PORd  SORd   TORd  CORd    Broadcastbin                     POBd  SOBd    TOBd   COBd
            {10, 100, 40, 30, "A",  13, "11111111111000000000000000000000", "11111111111110000000000000000000", "00001010011001000010100000011110", 11, "00001010011000000000000000000000", "10" , "96",  "0", "0",  "00001010011111111111111111111111", "10", "127", "255", "255"}, 
            {128, 100, 40, 30, "B", 19, "11111111111111111000000000000000", "11111111111111111110000000000000", "10000000011001000010100000011110", 17,  "10000000011001000000000000000000", "128", "100", "0", "0",  "10000000011001000111111111111111", "128", "100", "127", "255"},  
            {192, 100, 40, 30, "C", 30, "11111111111111111111111110000000", "11111111111111111111111111111100", "11000000011001000010100000011110", 25, "11000000011001000010100000000000", "192", "100", "40", "0", "11000000011001000010100001111111", "192", "100", "40", "127"}
        });

        return bateriaP;
    }
    

    
    public CalculadoraIpTest(int primerOctIpDec, int segundoOctIpDec, int tercerOctIpDec, int cuartoOctIpDec, String clase, 
        int bitsAEncender, String mascBin,String mascBinEsperada, String IpBin,int prefijo, String RedBin,
        String primerOctRedDec, String segundoOctRedDec, String tercerOctRedDec, String cuartoOctRedDec,String BroadCBin,
        String primerOctBroadDec, String segundoOctBroadDec, String tercerOctBroadDec, String cuartoOctBroadDec
    ){
        this.primerOctIpDec = primerOctIpDec;
        this.segundoOctIpDec = segundoOctIpDec;
        this.tercerOctIpDec = tercerOctIpDec;
        this.cuartoOctIpDec = cuartoOctIpDec;
        this.clase = clase;
        this.bitsAEncender = bitsAEncender;
        this.mascBin = mascBin;
        this.mascBinEsperada = mascBinEsperada;
        this.IpBin = IpBin;
        this.prefijo = prefijo;
        this.RedBin = RedBin;
        this.primerOctRedDec = primerOctRedDec;
        this.segundoOctRedDec = segundoOctRedDec;
        this.tercerOctRedDec = tercerOctRedDec;
        this.cuartoOctRedDec = cuartoOctRedDec;
        this.BroadCBin = BroadCBin;
        this.primerOctBroadCDec = primerOctBroadDec;
        this.segundoOctBroadCDec = segundoOctBroadDec;
        this.tercerOctBroadCDec = tercerOctBroadDec;
        this.cuartoOctBroadCDec = cuartoOctBroadDec;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
 
  
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of determinarClase method, of class CalculadoraIp.
     */
    @Test
    public void testDeterminarClase() {
        System.out.println("determinarClase");
        
        int[] ipDecimal = {primerOctIpDec, segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec} ;
        CalculadoraIp instance = new CalculadoraIp();
        String expResult = clase;
        String result = instance.determinarClase(ipDecimal);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals(result)){
        fail("----- El resultado del metodo Determinar Clase no es correcto -----");
       }
        assertEquals(expResult, result);
    }

    /**
    * Test of convertirBinarioDecimal method, of class CalculadoraIp.
     */
    @Test
    public void testConvertirBinarioDecimal() {
        System.out.println("convertirBinarioDecimal");
        String octetoBin = IpBin.substring(0,8);
        CalculadoraIp instance = new CalculadoraIp();
        int expResult = primerOctIpDec;
        int result = instance.convertirBinarioDecimal(octetoBin);
         if(expResult!=(result)){
        fail("----- El resultado del metodo Convertir Binario Decimal no es correcto -----");
       }
        
        assertEquals( expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of encenderBits method, of class CalculadoraIp.
     */
    @Test
    public void testEncenderBits() {
        System.out.println("encenderBits");
        int bitsAEncender = this.bitsAEncender;
        String mascaraBin = mascBin;//11
        CalculadoraIp instance = new CalculadoraIp();
        String expResult =  mascBinEsperada;//13
        String result = instance.encenderBits(bitsAEncender, mascaraBin);
        
        // TODO review the generated test code and remove the default call to fail.
         if(!expResult.equals(result)){
        fail("----- El resultado del metodo Encender Bits no es correcto -----");
       }
         
         assertEquals(expResult, result);
    }

   /**
     * Test of ipDecimalBinario method, of class CalculadoraIp.
     */
    @Test
    public void testIpDecimalBinario() {
        System.out.println("ipDecimalBinario");
        int[] ipDecimal = {primerOctIpDec, segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec};
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {IpBin.substring(0,8),IpBin.substring(8,16),IpBin.substring(16,24),IpBin.substring(24,32)};
        String[] result = instance.ipDecimalBinario(ipDecimal);
      
        // TODO review the generated test code and remove the default call to fail.
        
        for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Ip Decimal Binaro no es correcto -----");
       }
        }
          assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of convertirPrefijoRedBinOctPorOct method, of class CalculadoraIp.
     */
    @Test
    public void testCovertirPrefijoRedBinOctPorOct() {
        System.out.println("covertirPrefijoRedBinOctPorOct");
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {mascBin.substring(0,8), mascBin.substring(8,16), mascBin.substring(16,24), mascBin.substring(24,32)};
        String[] result = instance.convertirPrefijoRedBinOctPorOct(prefijo);
        System.out.println("-----------------"+result[0]+"-----------");
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Convertir Prefijo Red Bin Oct por Oct no es correcto -----" );
         
       }
        }
       
         assertArrayEquals(expResult, result);
    }

    /**
     * Test of concatenarMascaraBin method, of class CalculadoraIp.
     */
    @Test
    public void testConcatenarMascaraBin() {
        System.out.println("concatenarMascaraBin");
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String expResult = mascBin;
        String result = instance.concatenarMascaraBin(prefijo);
        // TODO review the generated test code and remove the default call to fail.
       if(!expResult.equals(result)){
        fail("----- El resultado del metodo Concatenar Mascara Bin no es correcto -----");
       }
         
         assertEquals(expResult, result);
    }

    /**
     * Test of calcularRedBin method, of class CalculadoraIp.
     */
    @Test
    public void testCalcularRedBin() {
        System.out.println("calcularRedBin");
        int[] ipDec = {primerOctIpDec,segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec};
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {RedBin.substring(0,8), RedBin.substring(8,16), RedBin.substring(16,24), RedBin.substring(24,32)};
        String[] result = instance.calcularRedBin(ipDec, prefijo);
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Calcular Red Bin no es correcto -----");
       }
        }
         assertArrayEquals(expResult, result);
    }

    /**
     * Test of calcularRedDecimal method, of class CalculadoraIp.
     */
    @Test
    public void testCalcularRedDecimal() {
        System.out.println("calcularRedDecimal");
        int[] ipDec = {primerOctIpDec, segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec};
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {primerOctRedDec, segundoOctRedDec, tercerOctRedDec, cuartoOctRedDec};
        String[] result = instance.calcularRedDecimal(ipDec, prefijo);
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Calcular Red Decimal  no es correcto -----");
       }
        }
         assertArrayEquals(expResult, result);
    }

    /**
     * Test of calcularBroadCastBin method, of class CalculadoraIp.
     */
    @Test
    public void testCalcularBroadCastBin() {
        
    
        System.out.println("calcularBroadCastBin");
        int[] ipDec = {primerOctIpDec, segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec};
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {BroadCBin.substring(0,8), BroadCBin.substring(8,16), BroadCBin.substring(16,24), BroadCBin.substring(24,32)};
        String[] result = instance.calcularBroadCastBin(ipDec, prefijo);
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Calcular BroadCast Bin no es correcto -----");
       }
        }
        
         assertArrayEquals(expResult, result);
    }

    /**
     * Test of calcularBroadcastDec method, of class CalculadoraIp.
     */
    @Test
    public void testCalcularBroadcastDec() {
        System.out.println("calcularBroadcastDec");
        int[] ipDec = {primerOctIpDec, segundoOctIpDec, tercerOctIpDec, cuartoOctIpDec};
        int prefijo = this.prefijo;
        CalculadoraIp instance = new CalculadoraIp();
        String[] expResult = {primerOctBroadCDec, segundoOctBroadCDec, tercerOctBroadCDec, cuartoOctBroadCDec};
        String[] result = instance.calcularBroadcastDec(ipDec, prefijo);

        // TODO review the generated test code and remove the default call to fail.
                for (int i = 0; i < 3; i++) {
              if(!expResult[i].equals(result[i])){
        fail("----- El resultado del metodo Calcular BroadCast Dec no es correcto -----");
       }
        }
        assertArrayEquals(expResult, result);
    }
    
}
