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


public class Behaviors{


    public  final Runnable SLEEP  ()  {
            try {
                System.out.println(" Sleeping 2 seconds zZZ zZZ zZZ ");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return null;
    }

    public   Runnable GOOD_BEHAVIOR () {
            try {
                System.out.println(" Good Behavior :) ");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
    }
}
