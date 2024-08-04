package entities;

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
public class Financing {
    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(Double totalAmount, Double income, Integer months) {
        validateFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        validateFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        validateFinancing(totalAmount, income, months);
        this.income = income;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        validateFinancing(totalAmount, income, months);
        this.months = months;
    }

    public Double entry() {
        return totalAmount * 0.2;
    }

    public Double quota() {
        return (totalAmount - entry()) / months;
    }

    private void validateFinancing(Double totalAmount, Double income, Integer months) {
        if (totalAmount * 0.8 / months > income / 2.0) {
            throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
        }
    }
}
