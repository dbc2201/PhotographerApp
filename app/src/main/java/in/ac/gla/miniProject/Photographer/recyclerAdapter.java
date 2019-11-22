package in.ac.gla.miniProject.Photographer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder>  {
    private List<upload_details> upload_details=new ArrayList<>();

    public recyclerAdapter(List<in.ac.gla.miniProject.Photographer.upload_details> upload_details) {
        this.upload_details = upload_details;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String title=upload_details.get(position).getTitle();
        String description=upload_details.get(position).getDescription();
        String img=upload_details.get(position).getImageurl();

        holder.set_title(title);
        holder.set_description(description);
        holder.set_img(img);


    }

    @Override
    public int getItemCount() {
        return upload_details.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title,desc;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.textView_title);
            desc=itemView.findViewById(R.id.textView_description);
            imageView=itemView.findViewById(R.id.imageView_image);
        }

        private void set_title(String tit)
        {
            title.setText(tit);
        }
        private void set_description(String description)
        {
            desc.setText(description);
        }
        private void set_img(String img)
        {
            Picasso.get().load(img).into(imageView);
        }
    }

}
