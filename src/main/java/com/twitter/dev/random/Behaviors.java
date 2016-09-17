/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2014
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.twitter.dev.random;


import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Behaviors{


    public static Response sleepOk() {
        try {
            // note we'd still want some variance in response time
            System.out.println("EXECUTING FINE");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

    public static Response spike() {
        try {
            // note we'd still want some variance in response time
            System.out.println("EXECUTING SPIKE zzZ zzZ  zzZ");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

    public static Response sortOfSlow() {
        try {
            // note we'd still want some variance in response time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

}
