package ucu.edu.task2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.mailCode = mailCode;
        this.client = client;
    }

    public String generate(Client client) {
        return mailCode.generate(client);
    }

}
