package devandroid.esther.listaprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import devandroid.esther.listaprodutos.adapter.AdapterProduto
import devandroid.esther.listaprodutos.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)

        //configuração do Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.ssd,
            nome = "SDD SanDisk Plus 480GB",
            descricao = "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            preco = "R$ 450,00"
        )
        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.processador,
            nome = "Intel Core i5 10400F",
            descricao = "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
            preco = "R$ 1050,00"
        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.memoria,
            nome = "Memória Ram Corsair 8GB DDR4",
            descricao = "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            preco = "R$ 369,00"
        )
        listaProdutos.add(produto3)

        val produto4 = Produto(
            R.drawable.placadevideo,
            nome = "GeForce RTX 3090 24GB",
            descricao = "Os blocos de construção para a GPU mais rápida e eficiente do mundo, o novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
            preco = "R$ 18.499,00"
        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.teclado,
            nome = "Teclado Mecânico Gamer T-Dagger Corvette",
            descricao = "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            preco = "R$ 299,00"
        )
        listaProdutos.add(produto5)

        val produto6 = Produto(
            R.drawable.gabinete,
            nome = "Gabinete Gamer",
            descricao = "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
            preco = "R$ 799,00"
        )
        listaProdutos.add(produto6)
    }
}