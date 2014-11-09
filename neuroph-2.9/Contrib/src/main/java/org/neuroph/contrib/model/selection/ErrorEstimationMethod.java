package org.neuroph.contrib.model.selection;

import org.neuroph.contrib.evaluation.domain.MetricResult;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.nnet.learning.BackPropagation;

public interface ErrorEstimationMethod {

    public MetricResult computeErrorEstimate(NeuralNetwork<BackPropagation> neuralNetwork, DataSet dataSet);

}
