package org.kotlin.config

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration

/**
 * Created by Kleber on 04/08/2016.
 */
@Configuration
open class JerseyConfig : ResourceConfig() {
    init {
        this.packages("org.kotlin")
    }
}