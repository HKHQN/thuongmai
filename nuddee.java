public class TatCaCacToiTrongLucSongVaTruocKhiChet {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║          DANH SÁCH 'TẤT CẢ' CÁC TỘI - UPDATE 2026          ║");
        System.out.println("║     (Không đảm bảo đầy đủ 100%, vì con người sáng tạo     ║");
        System.out.println("║               tội mới mỗi ngày...)                         ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        phanLoaiToi("TỘI TRONG LÚC SỐNG (rất phổ biến)");
        inToi("1. Kiêu ngạo / Tự cao tự đại (tội gốc rễ của mọi tội)");
        inToi("2. Tham lam / Ham tiền, ham của, tham quyền lực");
        inToi("3. Dâm dục / Ngoại tình, nghiện sex, xem phim người lớn quá mức");
        inToi("4. Nóng giận / Sân hận, chửi bới, đập phá");
        inToi("5. Tham ăn / Ăn uống vô độ, béo phì tự nguyện");
        inToi("6. Ghen tị / Ghét người khác hơn mình, 'ghen ăn tức ở'");
        inToi("7. Lười biếng / Nằm ì, trì hoãn, sống mục đích");
        inToi("8. Nói dối / Lừa đảo, bịa chuyện, fake news");
        inToi("9. Bất hiếu / Chửi cha mắng mẹ, bỏ rơi cha mẹ già");
        inToi("10. Sát sinh / Giết người, giết động vật vô cớ, phá thai");
        inToi("11. Trộm cắp / Ăn cắp vặt, tham ô, hack tài khoản");
        inToi("12. Uống rượu bia quá độ + nghiện chất kích thích");
        inToi("13. Mê tín dị đoan / Cúng bái sai chỗ, tin thầy bói quá mức");
        inToi("14. Lười học / Lười làm / Lười thay đổi bản thân");
        inToi("15. Sống giả tạo / Sống ảo, like ảo, follow ảo");
        inToi("16. Bội bạc / Phản bội bạn bè, người yêu, đồng nghiệp");
        inToi("17. Tự tử / Bỏ cuộc giữa chừng cuộc đời (tội rất nặng)");
        inToi("18. Thờ ơ với khổ đau của người khác (tội lớn nhất thời hiện đại?)");
        inToi("19. Nghiện điện thoại / Cuộc sống chỉ có TikTok, Reels, Shorts");
        inToi("20. ... và còn vài trăm tội khác nữa mà bạn đang nghĩ ra ngay lúc này");

        System.out.println();

        phanLoaiToi("TỘI ĐẶC BIỆT NGHIÊM TRỌNG TRƯỚC KHI CHẾT");
        inToi("→ Không hối hận về những tội đã làm khi còn sống");
        inToi("→ Nằm trên giường bệnh vẫn chửi người khác");
        inToi("→ Vẫn cố tình nói dối lần cuối");
        inToi("→ Không chịu tha thứ cho ai đó (dù chỉ trong lòng)");
        inToi("→ Vẫn tham lam, tiếc của đến giây phút cuối");
        inToi("→ Bỏ đi mà không kịp nói lời xin lỗi/tạm biệt người thân");
        inToi("→ Chết trong lúc đang làm điều xấu (ngoại tình, trộm cắp, nói lời độc ác)");
        inToi("→ Chết mà tâm vẫn đầy sân hận, oán trách");
        inToi("→ Không tin vào điều thiện, chỉ tin vào sự tuyệt vọng");

        System.out.println("\nKết luận triết lý ngắn gọn:");
        System.out.println("→ Tội lớn nhất có lẽ là: BIẾT MÌNH SAI MÀ VẪN CỨ SAI TIẾP");
        System.out.println("→ Cơ hội sửa sai tốt nhất: NGAY BÂY GIỜ (không phải chờ đến giường bệnh)");
        System.out.println("→ Level khó nhất: Sửa được tội cũ + Không tạo tội mới = Cao thủ thực thụ\n");

        System.out.println("Bạn đã phạm bao nhiêu tội trong danh sách trên?");
        System.out.println("Nhập số: (0-20) → Nếu > 5 thì... chúc mừng, bạn là người bình thường!");
    }

    private static void phanLoaiToi(String tieuDe) {
        System.out.println("┌────────────────────────────────────────────────────────────┐");
        System.out.println("│ " + tieuDe);
        System.out.println("└────────────────────────────────────────────────────────────┘");
    }

    private static void inToi(String toi) {
        System.out.printf("→ %s%n", toi);
    }
}
