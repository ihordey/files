package org.files.model;

import lombok.Value;
import org.files.model.structure.Resource;

import java.util.List;

@Value
public class Node<N extends Resource> {
    List<N> nodes;
}
