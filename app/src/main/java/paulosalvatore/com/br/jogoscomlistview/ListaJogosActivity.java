package paulosalvatore.com.br.jogoscomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import paulosalvatore.com.br.jogoscomlistview.adapter.JogosAdapter;
import paulosalvatore.com.br.jogoscomlistview.model.Jogo;

public class ListaJogosActivity extends AppCompatActivity {

	private List<Jogo> jogos;
	private ListView lvJogos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_jogos);

		jogos = getListaJogos();
		lvJogos = (ListView) findViewById(R.id.lvJogos);

		lvJogos.setAdapter(new JogosAdapter(ListaJogosActivity.this, jogos));

		lvJogos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(ListaJogosActivity.this,
						jogos.get(position).getNome(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	private List<Jogo> getListaJogos()
	{
		List<Jogo> jogos = new ArrayList<>();

		jogos.add(new Jogo(1, "Horizon Zero Dawn", 2017, R.drawable.horizon_dawn));
		jogos.add(new Jogo(2, "Uncharted 4", 2015, R.drawable.uncharted_4));

		return jogos;
	}
}
