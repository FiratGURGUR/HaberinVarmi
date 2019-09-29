package com.gurgur.haberinvarmi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ViewListener;


public class SliderFragment extends Fragment {
    CarouselView customCarouselView;
    Button buttonRight,buttonLeft;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    String[] sampleTitles = {"Orange", "Grapes", "Strawberry", "Cherry", "Apricot"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slider,container,false);

        buttonRight = view.findViewById(R.id.button);
        buttonLeft = view.findViewById(R.id.button2);

        customCarouselView = (CarouselView) view.findViewById(R.id.customCarouselView);
        customCarouselView.setPageCount(sampleImages.length);
        customCarouselView.setSlideInterval(4000);
        customCarouselView.setViewListener(viewListener);
        customCarouselView.playCarousel();
        customCarouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(getActivity(), " " + position, Toast.LENGTH_SHORT).show();
            }
        });

        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (customCarouselView.getCurrentItem() == 4){
                        customCarouselView.pauseCarousel();
                        customCarouselView.setCurrentItem(0);
                        customCarouselView.playCarousel();
                    }else{
                        customCarouselView.pauseCarousel();
                        int position = customCarouselView.getCurrentItem();
                        customCarouselView.setCurrentItem(position+1);
                        customCarouselView.playCarousel();
                    }


            }
        });
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (customCarouselView.getCurrentItem() == 0){
                    customCarouselView.pauseCarousel();
                    customCarouselView.setCurrentItem(4);
                    customCarouselView.playCarousel();
                }else {
                    customCarouselView.pauseCarousel();
                    int position = customCarouselView.getCurrentItem();
                    customCarouselView.setCurrentItem(position-1);
                    customCarouselView.playCarousel();
                }



            }
        });


        return view;
    }


    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {
            View customView = getLayoutInflater().inflate(R.layout.view_custom, null);
            TextView labelTextView = (TextView) customView.findViewById(R.id.labelTextView);
            ImageView fruitImageView = (ImageView) customView.findViewById(R.id.fruitImageView);
            fruitImageView.setImageResource(sampleImages[position]);
            labelTextView.setText(sampleTitles[position]);
            return customView;
        }
    };


}
