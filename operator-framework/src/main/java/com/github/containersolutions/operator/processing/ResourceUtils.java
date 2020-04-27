package com.github.containersolutions.operator.processing;

import io.fabric8.kubernetes.client.CustomResource;

public class ResourceUtils {

    public static String identifierWithVersion(CustomResource resource) {
        return "[Name: " + resource.getMetadata().getName() + ", Kind: " + resource.getKind()
                + ", Namespace: " + resource.getMetadata().getNamespace() + ", "
                + resource.getMetadata().getResourceVersion() + "]";
    }
}
