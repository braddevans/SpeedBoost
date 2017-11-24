/*
 * Adapted from the Wizardry License
 *
 * Copyright (c) 2017 DaPorkchop_ and contributors
 *
 * Permission is hereby granted to any persons and/or organizations using this software to copy, modify, merge, publish, and distribute it.
 * Said persons and/or organizations are not allowed to use the software or any derivatives of the work for commercial use or any other means to generate income, nor are they allowed to claim this software as their own.
 *
 * The persons and/or organizations are also disallowed from sub-licensing and/or trademarking this software without explicit permission from DaPorkchop_.
 *
 * Any persons and/or organizations using this software must disclose their source code and have it publicly available, include this license, provide sufficient credit to the original authors of the project (IE: DaPorkchop_), as well as provide a link to the original project.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package net.daporkchop.speedboost.config.impl;

import com.google.gson.JsonObject;
import net.daporkchop.speedboost.config.IConfigTranslator;

public class HopperCustomizationsTranslator implements IConfigTranslator {
    public static final HopperCustomizationsTranslator INSTANCE = new HopperCustomizationsTranslator();
    public boolean state = false;
    public int hopperTransfer;
    public int hopperCheck;
    public int hopperAmount;

    private HopperCustomizationsTranslator() {

    }

    public void encode(JsonObject json) {
        json.addProperty("state", state);
        json.addProperty("hopperTransfer", hopperTransfer);
        json.addProperty("hopperCheck", hopperCheck);
        //json.addProperty("hopperAmount", hopperAmount);
    }

    public void decode(String fieldName, JsonObject json) {
        state = getBoolean(json, "state", state);
        hopperTransfer = getInt(json, "hopperTransfer", hopperTransfer);
        hopperCheck = getInt(json, "hopperCheck", hopperCheck);
        hopperAmount = getInt(json, "hopperAmount", hopperAmount);
    }

    public String name() {
        return "hopperCustomizations";
    }

    public boolean getState() {
        return state;
    }

    public String getPackageName() {
        return "hoppercustomizations";
    }
}