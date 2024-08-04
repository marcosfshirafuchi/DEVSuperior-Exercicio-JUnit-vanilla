package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <h1> DEVSUPERIOR - Java Spring Expert - Capítulo 2: Testes automatizados</h1>
 * Exercício: JUnit vanilla
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   04/08/2024
 */

public class FinancingTests {
    /*
    *   Construtor
	*   ● Deve criar o objeto com os dados corretos quando os dados forem válidos
    */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void constructorShouldCreateObjectWhenValidData(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado do totalAmount, valor do getTotalAmount
        Assertions.assertEquals(100000.0,f.getTotalAmount());
        //Valor experado do income, valor do getIncome
        Assertions.assertEquals(2000.0, f.getIncome());
        //Valor experado do months, valor do getMonths
        Assertions.assertEquals(80, f.getMonths());
    }

    /*
     *   Construtor
     *    ●	Deve lançar IllegalArgumentException quando os dados não forem válidos
     */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Exceção e o método lambda para instanciar os objetos e as ações

        Assertions.assertThrows(IllegalArgumentException.class,()->{
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
            Financing f = new Financing(100000.0,2000.0,20);
        });

    }

    /*
        setTotalAmount
        ●	Deve atualizar o valor quando os dados forem válidos
     */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setTotalAmountShouldSetDataWhenValidData(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);
        //Act: execute as ações necessárias
        // O valor R$ 90000 vai passar no teste porque está abaixo do valor limite de R$100000
        f.setTotalAmount(90000.0);

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado do TotalAmount, valor do getTotalAmount()
        Assertions.assertEquals(90000.0,f.getTotalAmount());
    }

    /*
        setTotalAmount
        ● Deve lançar IllegalArgumentException quando os dados não forem válidos
     */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        //Assert: declare o que deveria acontecer (resultado esperado)
        //Exceção e o método lambda para instanciar os objetos e as ações
        Assertions.assertThrows(IllegalArgumentException.class,()->{
             /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
            Financing f = new Financing(100000.0,2000.0,80);
            //Act: execute as ações necessárias
            //O valor R$ 110000 está acima de totalAmount de R$ 100000 e por isso vai IllegalArgumentException
            f.setTotalAmount(110000.0);
        });

    }

    /*
        setIncome
        ●	Deve atualizar o valor quando os dados forem válidos
    */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setIncomeShouldSetDataWhenValidData(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);
        //Act: execute as ações necessárias
        // O valor R$ 2100 vai passar no teste porque está acima do valor limite de income de R$2000
        f.setIncome(2100.0);

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado do Income, valor do getIncome()
        Assertions.assertEquals(2100.0,f.getIncome());
    }

    /*
        setIncome
        ●	Deve lançar IllegalArgumentException quando os dados não forem válidos
    */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Exceção e o método lambda para instanciar os objetos e as ações
        Assertions.assertThrows(IllegalArgumentException.class,()->{
             /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
            Financing f = new Financing(100000.0,2000.0,80);
            //Act: execute as ações necessárias
            //O valor R$ 1900 está abaixo de income de R$ 2000 e por isso vai IllegalArgumentException
            f.setIncome(1900.0);
        });

    }

    /*
        setMonths
        ●	Deve atualizar o valor quando os dados forem válidos
    */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setMonthsShouldSetDataWhenValidData(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);
        //Act: execute as ações necessárias
        f.setMonths(81);

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado do Months, valor do getMonths()
        Assertions.assertEquals(81,f.getMonths());
    }

    /*
        setMonths
        ●	Deve lançar IllegalArgumentException quando os dados não forem válidos
    */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        //Assert: declare o que deveria acontecer (resultado esperado)
        //Exceção e o método lambda para instanciar os objetos e as ações
        Assertions.assertThrows(IllegalArgumentException.class,()->{
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
            Financing f = new Financing(100000.0,2000.0,80);
            //Act: execute as ações necessárias
            //O valor 79 meses está abaixo de months de 80 e por isso vai IllegalArgumentException
            f.setMonths(79);
        });

    }

    /*
        entry
        ●	Deve calcular corretamente o valor da entrada
     */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void entryShouldCalculateEntryCorrectly(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);
        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado do income, valor do método f.entry
        Assertions.assertEquals(20000.0,f.entry());
    }

    /*
        quota
        ●	Deve calcular corretamente o valor da prestação

     */
    @Test
    //Nomenclatura de um teste
    // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    public void quotaShouldCalculateEntryCorrectly(){
        /*
            Padrão AAA
            Arrange: instancie os objetos necessários
        */
        Financing f = new Financing(100000.0,2000.0,80);
        //Assert: declare o que deveria acontecer (resultado esperado)
        //Valor experado da metade do income, valor do método f.quota()
        Assertions.assertEquals(1000.0,f.quota());
    }

}
