package fr.euroforma.superquiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.euroforma.superquiz.databinding.FragmentQuizBinding;


public class QuizFragment extends Fragment {

    FragmentQuizBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentQuizBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}