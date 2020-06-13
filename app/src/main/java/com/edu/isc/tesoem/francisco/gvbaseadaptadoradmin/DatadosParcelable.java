package com.edu.isc.tesoem.francisco.gvbaseadaptadoradmin;

import android.os.Parcel;
import android.os.Parcelable;

public class DatadosParcelable implements Parcelable {
    String nombre, edad, sexo;

    public DatadosParcelable(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    protected DatadosParcelable(Parcel in) {
        nombre = in.readString();
        edad = in.readString();
        sexo = in.readString();
    }

    public static final Creator<DatadosParcelable> CREATOR = new Creator<DatadosParcelable>() {
        @Override
        public DatadosParcelable createFromParcel(Parcel in) {
            return new DatadosParcelable(in);
        }

        @Override
        public DatadosParcelable[] newArray(int size) {
            return new DatadosParcelable[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(edad);
        dest.writeString(sexo);
    }
}
