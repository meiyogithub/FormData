package com.example.android.formdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun simpan(view: View){
        var nama : String
        var nik : String
        var usia : String
        var jenisKelamin : String = ""
        var alamat : String
        var email : String
        var asalSekolah : String
        var kompetensi : String

        // Mengecek Data

        if (et_nama.text.toString() == "" || et_nik.text.toString() == ""
            || et_usia.text.toString() == "" || et_alamat.text.toString() == ""
            || et_email.text.toString() == "" || et_asalSekolah.text.toString() == ""
            ||radioGroup.checkedRadioButtonId == -1){
            Toast.makeText(this,"Data Belum Lengkap", Toast.LENGTH_SHORT).show()
        }else{
            //Mengambil Data Diri Form
            nama = et_nama.text.toString()
            nik = et_nik.text.toString()
            usia = et_usia.text.toString()
            alamat = et_alamat.text.toString()
            email = et_email.text.toString()
            asalSekolah = et_asalSekolah.text.toString()
            kompetensi = et_kompetensi.text.toString()

            if(rb_laki.isChecked)
                jenisKelamin = "Laki Laki"
            if(rb_perempuan.isChecked)
                jenisKelamin = "Perempuan"

            layout_depan.visibility = View.INVISIBLE
            layout_belakang.visibility = View.VISIBLE

            //HASIL ASKHIR
            tv_hasilNama.text = "Nama : $nama"
            tv_hasilNik.text = "NIK : $nik"
            tv_hasilUsia.text = "Usia : $usia"
            tv_hasilKelamin.text = "Jenis Kelamin : $jenisKelamin"
            tv_hasilAlamat.text = "Alamat : $alamat"
            hasil_email.text = "Email : $email"
            tv_hasilSekolah.text = "Asal Sekolah : $asalSekolah"
            tv_hasilKompetensi.text = "Kompetensi : $kompetensi"
        }
    }

    fun kembali(view: View){
        layout_depan.visibility = View.VISIBLE
        layout_belakang.visibility =  View.INVISIBLE
    }
}
