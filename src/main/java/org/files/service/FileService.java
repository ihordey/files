package org.files.service;

import java.io.File;
import java.io.IOException;

public interface FileService {
    String getDigest(File file) throws IOException;

    String getExtension(String filename);

    String getBaseName(String filename);

    long sizes(File file);

}
