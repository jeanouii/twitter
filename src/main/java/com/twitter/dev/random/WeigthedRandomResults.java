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


import java.util.*;


public class WeigthedRandomResults<T>{
    final Random random = new Random();

    final List<T> statusCodes = new ArrayList<>();

    public WeigthedRandomResults(final T... statusCodes) {
        Collections.addAll(this.statusCodes, statusCodes);
    }

    public WeigthedRandomResults(final Collection<T> statusCodes) {
        this.statusCodes.addAll(statusCodes);
    }

    public T get() {
        final int i = random.nextInt(statusCodes.size());
        return statusCodes.get(i);
    }
}
