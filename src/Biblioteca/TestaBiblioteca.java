package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class TestaBiblioteca {
    public static void main(String[] args) {
        List<Usuario> usuarios = createUsuarios();
        List<Livro> livros = createLivros();
        List<Emprestimo> emprestimoList = new ArrayList<>();




    }

    public static List<Usuario> createUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Fernanda"));
        usuarios.add(new Usuario("Gilson"));

        return usuarios;
    }

    public static List<Livro> createLivros(){
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("O Nome da Rosa – Umberto Eco (1980)"));
        livros.add(new Livro("O Pêndulo de Foucault – Umberto Eco (1988)"));
        livros.add(new Livro("O Estrangeiro – Albert Camus (1942)"));
        livros.add(new Livro("A Peste – Albert Camus (1947)"));
        livros.add(new Livro("Admirável Mundo Novo – Aldous Huxley (1932)"));
        livros.add(new Livro("1984 – George Orwell (1949)"));
        livros.add(new Livro("A Revolução dos Bichos – George Orwell (1945)"));
        livros.add(new Livro("Os Irmãos Karamázov – Fiódor Dostoiévski (1880)"));
        livros.add(new Livro("Crime e Castigo – Fiódor Dostoiévski (1866)"));
        livros.add(new Livro("O Pequeno Príncipe – Antoine de Saint-Exupéry (1943)"));
        livros.add(new Livro("Por Quem os Sinos Dobram – Ernest Hemingway (1940)"));
        livros.add(new Livro("Ulysses – James Joyce (1922)"));
        livros.add(new Livro("Finnegans Wake – James Joyce (1939)"));
        livros.add(new Livro("Memórias Póstumas de Brás Cubas – Machado de Assis (1881)"));
        livros.add(new Livro("Dom Casmurro – Machado de Assis (1899)"));
        livros.add(new Livro("Guerra e Paz – Lev Tolstói (1867)"));
        livros.add(new Livro("O Engenhoso Fidalgo Dom Quixote de la Mancha – Miguel de Cervantes (1615)"));
        livros.add(new Livro("O Amor nos Tempos do Cólera – Gabriel García Márquez (1985)"));
        livros.add(new Livro("Cem Anos de Solidão – Gabriel García Márquez (1967)"));
        livros.add(new Livro("Grande Sertão: Veredas – João Guimarães Rosa (1956)"));
        livros.add(new Livro("Primeiras Estórias  – João Guimarães Rosa (1962)"));
        livros.add(new Livro("A Hora da Estrela – Clarice Lispector (1977)"));
        livros.add(new Livro("Um Sopro de Vida – Clarice Lispector (1978)"));
        livros.add(new Livro("Madame Bovary – Gustav Flaubert (1856)"));
        livros.add(new Livro("O Vermelho e o Negro – Stendhal (1830)"));
        livros.add(new Livro("Em Busca do Tempo Perdido – Marcel Proust (1908)"));
        livros.add(new Livro("Hamlet – William Shakespeare (1609)"));
        livros.add(new Livro("Ilíada – Homero (século VIII a.C.)"));
        livros.add(new Livro("Odisseia – Homero (século VIII a.C.)"));
        livros.add(new Livro("Os Buddenbrook – Thomas Mann (1901)"));
        livros.add(new Livro("A Montanha Mágica – Thomas Mann (1924)"));
        livros.add(new Livro("Doutor Fausto – Thomas Mann (1947)"));
        livros.add(new Livro("Capitães da Areia – Jorge Amado (1937)"));
        livros.add(new Livro("As Flores do Mal – Charles Baudelaire (1857)"));
        livros.add(new Livro("Som e a Fúria – William Faulkner (1929)"));
        livros.add(new Livro("O Processo – Franz Kafka (1925)"));
        livros.add(new Livro("A Metamorfose – Franz Kafka (1915)"));
        livros.add(new Livro("A Terra Desolada – T. S. Eliot (1922)"));
        livros.add(new Livro("O Príncipe – Maquiável (1532)"));
        livros.add(new Livro("O Tempo e o Vento – Erico Verissimo (1985)"));
        livros.add(new Livro("Vidas Secas – Graciliano Ramos (1938)"));
        livros.add(new Livro("Os Miseráveis – Victor Hugo (1862)"));
        livros.add(new Livro("Notre-Dame de Paris – Victor Hugo (1831)"));
        livros.add(new Livro("O Pai Goriot (um dos principais livros de ‘A Comédia Humana’) – Honoré de Balzac (ca. 1829-1850)"));
        livros.add(new Livro("Ilusões Perdidas (um dos principais livros de ‘A Comédia Humana’) – Honoré de Balzac (1843)"));
        livros.add(new Livro("A Tarde de um Fauno – Stéphane Mallarmé (1876)"));
        livros.add(new Livro("E o Vento Levou – Margaret Mitchell (1936)"));
        livros.add(new Livro("Alice no País das Maravilhas – Lewis Carroll (1865)"));
        livros.add(new Livro("Anna Karenina – Lev Tolstói (1877)"));
        livros.add(new Livro("Emma – Jane Austen (1815)"));
        livros.add(new Livro("Orgulho e Preconceito – Jane Austen (1813)"));
        livros.add(new Livro("A Filha do Capitão – Alexander Pushkin (1836)"));
        livros.add(new Livro("O Jogo da Amarelinha – Júlio Cortázar (1953)"));
        livros.add(new Livro("Bonequinha de Luxo – Truman Capote (1958)"));
        livros.add(new Livro("A Dama do Cachorrinho e outros contos – Anton Tchekhov (1889)"));
        livros.add(new Livro("O Caçador de Pipas – Khaled Hosseini (2003)"));
        livros.add(new Livro("Fausto – Johann Wolfgang von Goethe (1829)"));
        livros.add(new Livro("Os sofrimentos do jovem Werther – Johann Wolfgang von Goethe (1774)"));
        livros.add(new Livro("Rumo ao Farol – Virginia Woolf (1927)"));
        livros.add(new Livro("Mrs. Dalloway – Virginia Woolf (1925)"));
        livros.add(new Livro("Histórias Extraordinárias – Edgar Allan Poe (1924)"));
        livros.add(new Livro("O Poço e o Pêndulo – Edgar Allan Poe (1842)"));
        livros.add(new Livro("Ficções – Jorge Luis Borges (1944)"));
        livros.add(new Livro("O Aleph – Jorge Luis Borges (1949)"));
        livros.add(new Livro("Pedro Páramo – Juan Rulfo (1955)"));
        livros.add(new Livro("Ensaio Sobre a Lucidez – José Saramago (2004)"));
        livros.add(new Livro("Ensaio sobre a Cegueira – José Saramago (1995)"));
        livros.add(new Livro("Um Delicado Equilíbrio – Rohinton Mistry (1955)"));
        livros.add(new Livro("Os Vestígios do Dia – Kazuo Ishiguro (1989)"));
        livros.add(new Livro("O Segundo Sexo – Simone de Beauvoir (1949)"));
        livros.add(new Livro("Diante da Dor dos Outros – Susan Sontag (2003)"));
        livros.add(new Livro("Lolita – Vladimir Nabokov (1955)"));
        livros.add(new Livro("Os Paços de Ulloa – Emilia Pardo Bazán (1886)"));
        livros.add(new Livro("Ponciá Vicêncio – Conceição Evaristo (2003)"));
        livros.add(new Livro("Quarto de Despejo – Carolina Maria de Jesus (1960)"));
        livros.add(new Livro("Robinson Crusoe – Daniel Defoe (1719)"));
        livros.add(new Livro("O Lobo da Estepe – Herman Hesse (1927)"));
        livros.add(new Livro("Demian – Hermann Hesse (1919)"));
        livros.add(new Livro("A Ilustre Casa de Ramires – Eça de Queirós (1900)"));
        livros.add(new Livro("Os Maias – Eça de Queirós (1888)"));
        livros.add(new Livro("O Ateneu – Raul Pompeia (1888)"));
        livros.add(new Livro("Triste Fim de Policarpo Quaresma – Lima Barreto (1915)"));
        livros.add(new Livro("A Pedra do Reino – Ariano Suassuna (1971)"));
        livros.add(new Livro("Macunaíma – Mário de Andrade (1928)"));
        livros.add(new Livro("Grandes Esperanças – Charles Dickens (1861)"));
        livros.add(new Livro("David Copperfield – Charles Dickens (1850)"));
        livros.add(new Livro("Os Cadernos de Pickwick – Charles Dickens (1837)"));
        livros.add(new Livro("Folhas de Relva – Walt Whitman (1855)"));
        livros.add(new Livro("O Leopardo – Tomasi di Lampedusa (1958)"));
        livros.add(new Livro("O Morro dos Ventos Uivantes – Emily Brontë (1847)"));
        livros.add(new Livro("O Quinze – Rachel de Queiroz (1930)"));
        livros.add(new Livro("O Canto do Pássaro – Sebastian Faulks (1993)"));
        livros.add(new Livro("Poemas Completos – Herberto Helder (2013)"));
        livros.add(new Livro("A Parte que Falta – Shel Silverstein (1976)"));
        livros.add(new Livro("O Hobbit ou Lá e de Volta Outra Vez – J. R. R. Tolkien (1937)"));
        livros.add(new Livro("O Sol é Para Todos – Harper Lee (1960)"));
        livros.add(new Livro("Os Cantos – Ezra Pund (1925)"));
        livros.add(new Livro("Cartas a um Jovem Poeta – Rainer Maria Rilke (1929)"));
        livros.add(new Livro("Germinal – Émile Zola (1885)"));
        livros.add(new Livro("A Redoma de Vidro – Sylvia Plath (1963)"));
        livros.add(new Livro("A Náusea – Jean-Paul Sartre (1938)"));
        livros.add(new Livro("Middlemarch – George Eliot (1871)"));
        livros.add(new Livro("Canções da Inocência-Canções da Experiência – William Blake (1789)"));
        livros.add(new Livro("Coração das Trevas – Joseph Conrad (1899)"));
        livros.add(new Livro("Terra sonâmbula – Mia Couto (1992)"));
        livros.add(new Livro("Livro do Desassossego – Bernardo Soares “Fernando Pessoa” (1913)"));
        livros.add(new Livro("Feliz Ano Novo – Rubem Fonseca (1975)"));
        livros.add(new Livro("O diário de Anne Frank – Anne Frank (1947)"));
        livros.add(new Livro("Laranja Mecânica – Anthony Burgess (1962)"));
        livros.add(new Livro("Tartufo – Molière (1664)"));
        livros.add(new Livro("Paraíso Perdido – John Milton (1667)"));
        livros.add(new Livro("O Capote – Nikolai Gogol (1842)"));
        livros.add(new Livro("Doutor Jivago – Boris Pasternak (1957)"));
        livros.add(new Livro("Os Cus de Judas – António Lobo Antunes (1979)"));
        livros.add(new Livro("A Máquina de Fazer Espanhóis – Valter Hugo Mãe (2010)"));
        livros.add(new Livro("Retrato de Uma Senhora – Henry James (1881)"));
        livros.add(new Livro("Sermões – Padre Antônio Vieira (ca. 1679 – 1697)"));
        livros.add(new Livro("Trilogia das Barcas [Auto da Barca do Inferno (1527), Auto da Barca do Purgatório (1518) e do auto da barca da Glória (1519)] – Gil Vicente (1518 – 1527)"));
        livros.add(new Livro("O Grande Gatsby – F. Scott Fitzgerald (1925)"));
        livros.add(new Livro("As Aventuras de Sherlock Holmes – Arthur Conan Doyle (1892)"));
        livros.add(new Livro("A Época da Inocência – Edith Wharton (1920)"));
        livros.add(new Livro("O Retrato de Dorian Gray – Oscar Wilde (1890)"));
        livros.add(new Livro("Memórias de Adriano – Marguerite Yourcenar (1951)"));
        livros.add(new Livro("As Cidades Invisíveis – Italo Calvino (1972)"));
        livros.add(new Livro("O Conto da Aia – Margaret Atwood (1985)"));
        livros.add(new Livro("Os Lusíadas – Luís Vaz de Camões (1572)"));
        livros.add(new Livro("A Menina que Roubava Livros – Markus Zusak (2005)"));
        livros.add(new Livro("Assassinato no Expresso do Oriente – Agatha Christie (1934)"));
        livros.add(new Livro("A Insustentável Leveza do Ser – Milan Kundera (1984)"));
        livros.add(new Livro("Orlando Furioso – Ludovico Ariosto (1532)"));
        livros.add(new Livro("Pais e Filhos – Ivan Turguêniev (1862)"));
        livros.add(new Livro("On the Road – Jack Kerouac (1957)"));
        livros.add(new Livro("A Morte de Virgílio – Hermann Broch (1945)"));
        livros.add(new Livro("Metamorfoses – Ovídio (8 d.C.)"));
        livros.add(new Livro("O Complexo de Portnoy – Philip Roth (1969)"));
        livros.add(new Livro("Servidão Humana – William Somerset Maugham (1915)"));
        livros.add(new Livro("Antes do Baile Verde – Lygia Fagundes Telles (1970)"));
        livros.add(new Livro("Lavoura Arcaica – Raduan Nassar (1975)"));
        livros.add(new Livro("Morte e Vida Severina – João Cabral de Melo Neto (1967)"));
        livros.add(new Livro("O Arco e a Lira – Octavio Paz (1956)"));
        livros.add(new Livro("Poemas – Konstantinos Kaváfis (ca. 1904)"));
        livros.add(new Livro("Uma Temporada no Inferno – Arthur Rimbaud (1873)"));
        livros.add(new Livro("Homens de Milho – Miguel Ángel Asturias (1949)"));
        livros.add(new Livro("Pontos de Vista de um Palhaço – Heinrich Böll (1963)"));
        livros.add(new Livro("Trópico de Câncer – Henry Miller (1934)"));
        livros.add(new Livro("A Cidade e os Cachorros – Mario Vargas Llosa (1962)"));
        livros.add(new Livro("Auto de Fé – Elias Canetti (1935)"));
        livros.add(new Livro("O Apanhador no Campo de Centeio – J. D. Salinger (1951)"));
        livros.add(new Livro("Ensaios – Michel Montaigne (1580)"));
        livros.add(new Livro("Confissões – Agostinho de Hipona (ca. 397 – 400 d.C.)"));
        livros.add(new Livro("A Divina Comédia – Dante Alighieri (ca. 1304-1321)"));
        livros.add(new Livro("Cândido ou O Otimismo – Voltaire (1759)"));
        livros.add(new Livro("200 Crônicas Escolhidas – Rubem Braga (1977)"));
        livros.add(new Livro("Fazenda Maldita – Stella Gibbons (1932)"));
        livros.add(new Livro("Genji Monogatari – atribuído a Murasaki Shikib (início do século XI)"));
        livros.add(new Livro("A Ilha Misteriosa – Julio Verne (1874)"));
        livros.add(new Livro("Viagens de Gulliver – Jonathan Swift (1726)"));
        livros.add(new Livro("Tom Jones – Henry Fielding (1749)"));
        livros.add(new Livro("Elogio da Loucura – Desidério Erasmo (ca. 1509-1511)"));
        livros.add(new Livro("Os Três Mosqueteiros – Alexandre Dumas (1844)"));
        livros.add(new Livro("Decamerão – Giovanni Boccaccio (ca. 1348-1353)"));
        livros.add(new Livro("Kim. Rudyard Kipling (1865-1936)"));

        return livros;
    }
}
