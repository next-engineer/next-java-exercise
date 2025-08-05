package org.example.basic.parkminji.unitseventeen.operations;

import org.example.basic.parkminji.unitseventeen.Operation;

public class AddOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
