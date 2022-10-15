package br.com.up.pokedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.R
import com.squareup.picasso.Picasso

class PokeAdapter() : RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    inner class PokeViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): PokeViewHolder {

      val inflater = LayoutInflater.from(parent.context)

        val layout = inflater.inflate(R.layout.poke_view, parent, false)

        return PokeViewHolder(layout)

    }

    override fun onBindViewHolder(holder: PokeViewHolder,
                                  position: Int) {

        var url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/54.png"



        val imageView : ImageView = holder.itemView.findViewById(R.id.PokeImage)

        Picasso.get().load(url).into(imageView)


    }

    override fun getItemCount(): Int {

        return 15


    }


}