package com.km.parcelorganizer.ui.parcels

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.km.parcelorganizer.R
import com.km.parcelorganizer.model.Parcel

class ParcelsDetailView : Fragment() {
    private lateinit var parcel: Parcel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            parcel = it.getParcelable("parcel")!!
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parcel_detail, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Bind the parcel data to the views
        view.findViewById<TextView>(R.id.tvParcelId).text = "ID: ${parcel.id}"
        view.findViewById<TextView>(R.id.tvParcelName).text = "Name: ${parcel.title}"
        view.findViewById<TextView>(R.id.tvParcelDescription).text = "Description: ${parcel.additionalInformation}"
        view.findViewById<TextView>(R.id.tvParcelStatus).text = "Status: ${parcel.parcelStatus}"
        view.findViewById<TextView>(R.id.tvParcelSender).text = "Sender: ${parcel.sender}"
        view.findViewById<TextView>(R.id.tvParcelCourier).text = "Courier: ${parcel.courier}"
        view.findViewById<TextView>(R.id.tvParcelTrackingUrl).text = "Last Updated: ${parcel.trackingUrl}"
    }

    companion object {
        @JvmStatic
        fun newInstance(parcel: Parcel) =
            ParcelsDetailView().apply {
                arguments = Bundle().apply {
                    putParcelable("parcel", parcel)
                }
            }
    }
}