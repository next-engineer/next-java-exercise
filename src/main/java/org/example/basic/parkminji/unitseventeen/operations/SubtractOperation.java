package org.example.basic.parkminji.unitseventeen.operations;

import org.example.basic.parkminji.unitseventeen.Operation;

public class SubtractOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
