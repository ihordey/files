package org.files.model;

import lombok.Value;

@Value
public class Check {
    private final String name;
    private final String ext;
    private final long size;
    private final String digest;
}
