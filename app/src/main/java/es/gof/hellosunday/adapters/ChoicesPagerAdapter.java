package es.gof.hellosunday.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import es.gof.hellosunday.fragments.MyChoicesFragment;
import es.gof.hellosunday.fragments.RecomendedChoicesFragment;

/**
 * Created by goofyahead on 7/6/16.
 */
public class ChoicesPagerAdapter extends FragmentPagerAdapter {
    Fragment [] fragments = new Fragment[2];
    String [] titles = new String [] {"MyChoices", "Recommended"};

    public ChoicesPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments[0] = MyChoicesFragment.newInstance();
        fragments[1] = RecomendedChoicesFragment.newInstance();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return 2;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }


}
