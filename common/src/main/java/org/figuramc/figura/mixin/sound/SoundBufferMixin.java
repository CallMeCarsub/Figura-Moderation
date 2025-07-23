package org.figuramc.figura.mixin.sound;

import com.mojang.blaze3d.audio.SoundBuffer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Accessor;

import javax.sound.sampled.AudioFormat;

@Mixin(SoundBuffer.class)
public interface SoundBufferMixin{
    @Accessor
    AudioFormat getFormat();
}
