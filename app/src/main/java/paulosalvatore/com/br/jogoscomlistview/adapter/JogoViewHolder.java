package paulosalvatore.com.br.jogoscomlistview.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import paulosalvatore.com.br.jogoscomlistview.R;

/**
 * Created by paulo on 07/04/2017.
 */

class JogoViewHolder {
	final ImageView ivJogo;
	final TextView tvNome;
	final TextView tvAnoLancamento;

	public JogoViewHolder(View view) {
		ivJogo = (ImageView) view.findViewById(R.id.ivJogo);
		tvNome = (TextView) view.findViewById(R.id.tvNome);
		tvAnoLancamento = (TextView) view.findViewById(R.id.tvAnoLancamento);
	}
}
