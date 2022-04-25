package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//従業員情報について画面の入力値・出力値を扱うviewモデル

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeView {

    //id
    private Integer id;

    //社員番号
    private String code;

    //名前
    private String name;

    //パスワード
    private String password;

    //管理者権限があるかどうか
   private Integer adminFlag;

   //登録日時
   private LocalDateTime createdAt;

   //更新日時
   private LocalDateTime updatedAt;

   //削除された従業員かどうか
   private Integer deleteFlag;


}
