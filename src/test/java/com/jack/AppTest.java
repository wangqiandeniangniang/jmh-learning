package com.jack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Benchmark
    public void measureName() {

    }

    public static void main( String[] args ) throws IOException, RunnerException {
        System.out.println( "Hello World!" );
        Options opt = new OptionsBuilder()
                .include(AppTest.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }

    /**
     * Rigorous Test :-)
     */
    @Benchmark
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
