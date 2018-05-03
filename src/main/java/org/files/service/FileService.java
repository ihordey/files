package org.files.service;

import org.files.model.Node;
import org.files.model.structure.Resource;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface FileService {
    String getDigest(File file) throws IOException;

    String getExtension(String filename);

    String getBaseName(String filename);

    long sizes(File file);

    Collection<File> read(String resourcePath);
}
