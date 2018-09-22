package com.zuche.uodis;

import com.zuche.uodis.commands.*;

import java.io.Closeable;

/**
 * @author: XiongMM
 * @date: 2018/9/22 15:57
 * @description:
 */
public interface UodisCommands extends  BasicCommands ,BinaryUodisCommands, MultiKeyBinaryCommands,
        AdvancedBinaryUodisCommands, BinaryScriptingCommands, Closeable {
}
