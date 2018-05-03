package org.files.model.structure;

import lombok.Value;

@Value
public class File extends Resource {
    private String ext;
    private String digest;
}
