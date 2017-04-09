package paulosalvatore.com.br.jogoscomlistview.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import paulosalvatore.com.br.jogoscomlistview.R;
import paulosalvatore.com.br.jogoscomlistview.model.Jogo;

/**
 * Created by paulo on 07/04/2017.
 */

public class JogosAdapter extends BaseAdapter
{
	private Context context;
	private List<Jogo> jogos;

	public JogosAdapter(Context context, List<Jogo> jogos)
	{
		this.context = context;
		this.jogos = jogos;
	}

	@Override
	public int getCount() {
		return jogos.size();
	}

	@Override
	public Object getItem(int position) {
		return jogos.get(position);
	}

	@Override
	public long getItemId(int position) {
		return jogos.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view;

		JogoViewHolder holder;

		if (convertView == null)
		{
			view = LayoutInflater.from(context).inflate(R.layout.jogo_item, parent, false);
			holder = new JogoViewHolder(view);
			view.setTag(holder);
		}
		else
		{
			view = convertView;
			holder = (JogoViewHolder) view.getTag();
		}

		Jogo jogo = jogos.get(position);

		holder.ivJogo.setImageDrawable(ContextCompat.getDrawable(context, jogo.getResourceIdImagem()));
		holder.tvNome.setText(jogo.getNome());
		holder.tvAnoLancamento.setText(String.valueOf(jogo.getAnoLancamento()));

		return view;
	}
}
