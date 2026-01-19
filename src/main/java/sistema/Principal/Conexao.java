package sistema.Principal;
import java.sql.*;

public class Conexao implements AutoCloseable {

    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/meurestaurante";
    private final String user = "root";
    private final String senha = "";

    public Conexao() throws SQLException {
        this.conn = DriverManager.getConnection(this.url, this.user, this.senha);
    }

    public int executarComando(String sql, Object... params) {
        int linhas = 0;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            linhas = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhas;
    }

    public ResultSet executarQuery(String sql, Object... params) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            stmt.setObject(i + 1, params[i]);
        }
        return stmt.executeQuery();
    }

    @Override
    public void close() {
        try {
            if (conn != null && !conn.isClosed()) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
