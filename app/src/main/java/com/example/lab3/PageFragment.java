package com.example.lab3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    private static final String positionKey = "POSITION_KEY";
    private static final String list1 = "Данное приложение разработано с целью подбодрить в трудную минуту, расслабить после тяжелого дня и сделать Вас еще частливие. При нажатии на картинку с вариантом самочувствия вы увидите рекомендации, на вкладке гороскопов выбирайте свой знако зодиака, и вы перейдете на страницу, на которой написаны данные, которые взяты из сайта.";
    private static final String list2 = "Для просмотра профиля перейдите в пункт 'Профиль'. При переходе в пункт 'Разработчик' Вам будет показана информация о разработчике данного приложения";
    private static final String list3 = "Благодарю за скачивание данного приложения и поддержку проекта, вместе нам ВСЁ ни по чем!";

    public static PageFragment getNewInstance(int position){
        PageFragment pageFragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(positionKey, position);
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txtPosition = view.findViewById(R.id.txtPosition);
        switch (getArguments().getInt(positionKey)){
            case 1:{
                txtPosition.setText(list1);
                break;
            }
            case 2:{
                txtPosition.setText(list2);
                break;
            }
            default:{
                txtPosition.setText(list3);
                break;
            }
        }
    }
}
