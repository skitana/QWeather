package com.example.myapplication.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u00c7\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/myapplication/network/CurrentWeatherData;", "", "seen1", "", "temperature", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(I)V", "getTemperature$annotations", "()V", "getTemperature", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
@kotlinx.serialization.Serializable()
public final class CurrentWeatherData {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.network.CurrentWeatherData.Companion Companion = null;
    private final int temperature = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.network.CurrentWeatherData copy(int temperature) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.network.CurrentWeatherData self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public CurrentWeatherData(int temperature) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTemperature() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "temperature")
    @java.lang.Deprecated()
    public static void getTemperature$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myapplication/network/CurrentWeatherData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/myapplication/network/CurrentWeatherData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.example.myapplication.network.CurrentWeatherData> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/example/myapplication/network/CurrentWeatherData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/myapplication/network/CurrentWeatherData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.example.myapplication.network.CurrentWeatherData> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.myapplication.network.CurrentWeatherData.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.myapplication.network.CurrentWeatherData deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.example.myapplication.network.CurrentWeatherData value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}