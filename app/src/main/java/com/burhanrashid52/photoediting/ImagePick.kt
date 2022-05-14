package com.burhanrashid52.photoediting

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.burhanrashid52.photoediting.EditImageActivity.Companion.CAMERA_REQUEST
import com.burhanrashid52.photoediting.base.BaseActivity
import ja.burhanrashid52.photoeditor.PhotoEditorView
import java.io.IOException

class ImagePick : BaseActivity(){
//    private var mBntPickGallery : Button? = null
//    private var mBntPickPhoto : Button? = null
//    private var mImageView : PhotoEditorView? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        makeFullScreen()
//        setContentView(R.layout.activity_pick_image)
//        initView();
//
//        mBntPickGallery?.setOnClickListener{
//            val intent = Intent()
//            intent.type = "image/*"
//            intent.action = Intent.ACTION_GET_CONTENT
//            startActivityForResult(
//                Intent.createChooser(intent, "Select Picture"),
//                EditImageActivity.PICK_REQUEST
//            )
//        }
//
//        mBntPickPhoto?.setOnClickListener{
//            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivityForResult(cameraIntent, EditImageActivity.CAMERA_REQUEST)
//        }
//    }
//
//    private fun initView() {
////        mBntPickGallery = findViewById(R.id.btnPickGallery)
////        mBntPickPhoto = findViewById(R.id.btnPickPhoto)
////        mImageView = findViewById(R.id.imageView)
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode == RESULT_OK) {
//            when (requestCode) {
//                EditImageActivity.CAMERA_REQUEST -> try{
//                    val photo = data?.extras?.get("data") as Bitmap?
//                    val intent = Intent(this, EditImageActivity::class.java)
//                    intent.putExtra("BitmapImage", photo)
//                    startActivity(intent)
//
//                }catch(e: IOException){
//                    e.printStackTrace()
//                }
//                EditImageActivity.PICK_REQUEST -> try {
//                    val uri = data?.data
//                    val bitmap = MediaStore.Images.Media.getBitmap(
//                        contentResolver, uri
//                    )
//                    mImageView?.source?.setImageBitmap(bitmap)
//                } catch (e: IOException) {
//                    e.printStackTrace()
//                }
//            }
//        }
//    }
}