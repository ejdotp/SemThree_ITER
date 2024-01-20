----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 12/23/2023 01:28:51 PM
-- Design Name: 
-- Module Name: BinaryGrayConverter_tb - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;-

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
entity BinaryGrayConverter_tb is
   -- Port ( ) ;
end BinaryGrayConverter_tb;
-- E. Jagadeeswar Patro - 2241016309
architecture dataflow of BinaryGrayConverter_tb is
component BinaryGrayConverter
port(b1, b2, b3, b4: in std_logic;
     g1, g2, g3, g4: out std_logic);
end component;
signal b1, b2, b3, b4: std_logic;
signal g1, g2, g3, g4: std_logic;

begin
uut: BinaryGrayConverter port map(b1 => b1, b2 => b2, b3 => b3, b4 => b4, g1 => g1, g2 => g2, g3 => g3, g4 => g4);
stimulus: process
begin
b1<='0'; b2<='0'; b3<='0'; b4<='0'; wait for 10ns;
b1<='0'; b2<='0'; b3<='0'; b4<='1'; wait for 10ns;
b1<='0'; b2<='0'; b3<='1'; b4<='0'; wait for 10ns;
b1<='0'; b2<='0'; b3<='1'; b4<='1'; wait for 10ns;
b1<='0'; b2<='1'; b3<='0'; b4<='0'; wait for 10ns;
b1<='0'; b2<='1'; b3<='0'; b4<='1'; wait for 10ns;
b1<='0'; b2<='1'; b3<='1'; b4<='0'; wait for 10ns;
b1<='0'; b2<='1'; b3<='1'; b4<='1'; wait for 10ns;
b1<='1'; b2<='0'; b3<='0'; b4<='0'; wait for 10ns;
b1<='1'; b2<='0'; b3<='0'; b4<='1'; wait for 10ns;
b1<='1'; b2<='0'; b3<='1'; b4<='0'; wait for 10ns;
b1<='1'; b2<='0'; b3<='1'; b4<='1'; wait for 10ns;
b1<='1'; b2<='1'; b3<='0'; b4<='0'; wait for 10ns;
b1<='1'; b2<='1'; b3<='0'; b4<='1'; wait for 10ns;
b1<='1'; b2<='1'; b3<='1'; b4<='0'; wait for 10ns;
b1<='1'; b2<='1'; b3<='1'; b4<='1'; wait for 10ns;
end process;
end dataflow;
