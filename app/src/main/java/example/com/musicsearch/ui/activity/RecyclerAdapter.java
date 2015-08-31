package example.com.musicsearch.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import example.com.musicsearch.Constants;
import example.com.musicsearch.R;
import example.com.musicsearch.rest.model.Result;

/**
 * Created by alamatounkara on 8/31/15.
 */
public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {


    List<Result> mApiData; //result data we got from the api
    private Context mContext;



    public RecyclerAdapter(List<Result> results, Context context){
        this.mApiData = results;
        this.mContext = context;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating the single_row.xml
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent,false);

        return new ItemViewHolder(row);//returning the the view holder
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        //using Picasso to set of image
        Picasso.with(mContext).load(mApiData.get(position).getArtworkUrl60()).into(holder.mAlbumImage);
        holder.mTrackName.setText(mApiData.get(position).getTrackName());
        holder.mArtistName.setText(mApiData.get(position).getArtistName());
        holder.mAlbumName.setText(mApiData.get(position).getCollectionName());
    }



    @Override
    public int getItemCount() {
        return mApiData.size();
    }


    /**
     * View holder class used to avoid the findViewById() repetition calls
     */
    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView mAlbumImage;
        public TextView mTrackName, mArtistName, mAlbumName;
        public ViewGroup mRow;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mAlbumImage = (ImageView) itemView.findViewById(R.id.albumIV);
            mTrackName = (TextView)itemView.findViewById(R.id.trackNameTV);
            mAlbumName = (TextView)itemView.findViewById(R.id.albumNameTV);
            mArtistName = (TextView)itemView.findViewById(R.id.artistNameTV);
            mRow = (ViewGroup)itemView.findViewById(R.id.list_row);
            mRow.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext, LyricsActivity.class);
            intent.putExtra(Constants.ARTIST_NAME, mArtistName.getText().toString());
            intent.putExtra(Constants.SONG_NAME, mTrackName.getText().toString());
            intent.putExtra(Constants.IMAGE_URL,mApiData.get(getAdapterPosition()).getArtworkUrl60());
            intent.putExtra(Constants.ALBUM_NAME, mAlbumName.getText().toString());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(intent);
        }
    }

}
