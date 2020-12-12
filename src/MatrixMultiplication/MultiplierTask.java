/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixMultiplication;

/**
 *
 * @author AbdallaEssam
 */
public abstract class MultiplierTask implements Runnable {

    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;

    public MultiplierTask(
            double[][] result,
            double[][] matrix1,
            double[][] matrix2
    ) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }
}
