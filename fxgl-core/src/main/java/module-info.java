/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

/**
 *
 */
module com.almasb.fxgl.core {
    requires transitive kotlin.stdlib;
    requires transitive javafx.graphics;
    requires transitive javafx.base;

    exports com.almasb.fxgl.core;
    exports com.almasb.fxgl.core.asset;
    exports com.almasb.fxgl.core.collection;
    exports com.almasb.fxgl.core.collection.grid;
    exports com.almasb.fxgl.core.concurrent;
    exports com.almasb.fxgl.core.fsm;
    exports com.almasb.fxgl.core.math;
    exports com.almasb.fxgl.core.pool;
    exports com.almasb.fxgl.core.reflect;
    exports com.almasb.fxgl.core.serialization;
    exports com.almasb.fxgl.core.util;

    exports com.almasb.fxgl.animation;
    exports com.almasb.fxgl.event;
    exports com.almasb.fxgl.localization;
    exports com.almasb.fxgl.logging;
    exports com.almasb.fxgl.texture;
    exports com.almasb.fxgl.time;
}