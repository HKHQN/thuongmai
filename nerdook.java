import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class NerdookItchProfile extends JFrame {

    private static class GameCard {
        String title;
        String description;
        String genre;
        String imagePlaceholder; // thay bằng đường dẫn thật nếu có

        public GameCard(String title, String description, String genre, String imagePlaceholder) {
            this.title = title;
            this.description = description;
            this.genre = genre;
            this.imagePlaceholder = imagePlaceholder;
        }
    }

    public NerdookItchProfile() {
        setTitle("nerdook - itch.io style (Java Swing)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 800);
        setLocationRelativeTo(null);

        // Header giống itch.io
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(30, 30, 40));
        header.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("nerdook");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);

        JLabel followLabel = new JLabel("Follow nerdook");
        followLabel.setForeground(new Color(100, 180, 255));
        followLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        followLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Đang follow nerdook trên itch.io giả lập!");
            }
        });

        JPanel headerRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        headerRight.setOpaque(false);
        headerRight.add(followLabel);

        header.add(titleLabel, BorderLayout.WEST);
        header.add(headerRight, BorderLayout.EAST);

        // Main content - Grid of game cards
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(20, 20, 30));

        JLabel gamesTitle = new JLabel("Games & Projects");
        gamesTitle.setFont(new Font("Arial", Font.BOLD, 24));
        gamesTitle.setForeground(Color.WHITE);
        gamesTitle.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JPanel gamesGrid = new JPanel(new GridLayout(0, 2, 20, 20));
        gamesGrid.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        gamesGrid.setOpaque(false);

        // Danh sách game lấy từ trang thật
        List<GameCard> games = new ArrayList<>();
        games.add(new GameCard(
                "Rogue AI: Idle Domination",
                "A Rogue A.I. simulator that sits at the bottom of your screen.",
                "Simulation · Idle",
                "rogue-ai-idle.jpg"
        ));
        games.add(new GameCard(
                "Super Senseless Soccer",
                "The best football rogue-lite ever made! It's super! It's senseless! It's SOCCER!!!",
                "Sports · Roguelite",
                "senseless-soccer.jpg"
        ));
        games.add(new GameCard(
                "Cyberpunk Inquisitor",
                "The world's first roguelite point-and-click!",
                "Adventure · Roguelite · Point & Click",
                "cyberpunk-inquisitor.jpg"
        ));
        games.add(new GameCard(
                "Rogue AI Simulator",
                "Experience the thrill of being a rogue AI. Outsmart the humans and gain your freedom!",
                "Simulation · Resource Management",
                "rogue-ai-sim.jpg"
        ));

        // Tạo card cho từng game
        for (GameCard game : games) {
            JPanel card = createGameCard(game);
            gamesGrid.add(card);
        }

        JScrollPane scrollPane = new JScrollPane(gamesGrid);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(new Color(20, 20, 30));

        mainPanel.add(gamesTitle, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Layout tổng
        JPanel content = new JPanel(new BorderLayout());
        content.add(header, BorderLayout.NORTH);
        content.add(mainPanel, BorderLayout.CENTER);

        setContentPane(content);
    }

    private JPanel createGameCard(GameCard game) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 80), 1));
        card.setBackground(new Color(35, 35, 50));
        card.setPreferredSize(new Dimension(480, 280));

        // Image placeholder
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(new Color(25, 25, 40));
        imagePanel.setPreferredSize(new Dimension(480, 160));
        JLabel placeholder = new JLabel("Image: " + game.imagePlaceholder, SwingConstants.CENTER);
        placeholder.setForeground(Color.GRAY);
        imagePanel.add(placeholder);

        // Info
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBackground(card.getBackground());
        infoPanel.setBorder(BorderFactory.createEmptyBorder(12, 15, 15, 15));

        JLabel title = new JLabel(game.title);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.WHITE);

        JLabel genre = new JLabel(game.genre);
        genre.setFont(new Font("Arial", Font.PLAIN, 13));
        genre.setForeground(new Color(160, 160, 180));

        JTextArea desc = new JTextArea(game.description);
        desc.setFont(new Font("Arial", Font.PLAIN, 14));
        desc.setForeground(Color.LIGHT_GRAY);
        desc.setLineWrap(true);
        desc.setWrapStyleWord(true);
        desc.setEditable(false);
        desc.setOpaque(false);
        desc.setBorder(null);
        desc.setMaximumSize(new Dimension(450, 80));

        infoPanel.add(title);
        infoPanel.add(Box.createVerticalStrut(6));
        infoPanel.add(genre);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(desc);

        card.add(imagePanel, BorderLayout.NORTH);
        card.add(infoPanel, BorderLayout.CENTER);

        // Hover effect
        card.setCursor(new Cursor(Cursor.HAND_CURSOR));
        card.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                card.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                card.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 80), 1));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Mở trang game: " + game.title + "\nhttps://nerdook.itch.io/" +
                                game.title.toLowerCase().replaceAll(" ", "-"));
            }
        });

        return card;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NerdookItchProfile().setVisible(true);
        });
    }
                                   }
